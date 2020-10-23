public class CircularArray{
  private int start;
  private int size;
  private Object [] cir;
  public CircularArray(Object [] lin, int st, int sz){
    start =st;
    size=sz;
    int k=start; //keeping my start on k
    int len=lin.length;//keeping linear length on len, for creating same lengthed circular array
    cir=new Object[len];//creating same lengthed circular array
    for(int i=0;i<lin.length;i++){
      cir[k]=lin[i];
    
    k=(k+1)%cir.length;
//      if(k==cir.length){//if it goes to finish line, then it will be zero again by force to wrap up
//        k=0;
//      }
    }
    
 }
  public void printFullLinear(){
   for(int i=0; i<cir.length;i++){
     if(!(i==cir.length-1)){
       
      System.out.print(cir[i]+",");
    }
     else{
       System.out.print(cir[i]+".");
     }
   }
   System.out.println();
}
 public void printForward(){
    int k=start;
    Object [] lin=new Object[cir.length];
    for(int i=0;i<size;i++){
      lin[i]=cir[k];
      k++;
      if(k==cir.length){
        k=0;
      }
    }
    for(int i=0;i<lin.length;i++){
     if(!(i==lin.length-1)&&(!(i==lin.length-2))){
       
      System.out.print(lin[i]+",");
    }
        else if(i==lin.length-2){
          System.out.print(lin[i]);
        }
     else if(lin[i]==null){
       break; 
       }
    }
    System.out.print(".");
    System.out.println();
  }
  public void printBackward(){
    int k=start;
    Object [] lin=new Object[cir.length];
    for(int i=0;i<size;i++){
      lin[i]=cir[k];
      k++;
      if(k==cir.length){
        k=0;
      }
    }
    for(int i=lin.length-1;i>=0;i--){
      if(!(i==0)){
        if(!(lin[i]==null)){
          System.out.print(lin[i]+",");
        }
      }
     else{
       System.out.print(lin[i]+".");
     }
    }
  }
  public void linearize(){
    int k=start;
    Object [] lin=new Object[cir.length-1];
    for(int i=0;i<lin.length;i++){
      if(!(cir[k]==null)){
      lin[i]=cir[k];
      k=(k+1)%cir.length;
      }
      }
    cir=lin;
  }
 public void resizeStartUnchanged(int newcapacity){
   int k=start;
   int i;
   Object [] newArray=new Object[cir.length];
   for(i=0;i<newArray.length;i++){
     newArray[i]=cir[k];
     k=(k+1)%cir.length;
   }
   i=0;
   Object [] lin=new Object[newcapacity];
   for(int j=0;j<newcapacity;j++){
     if(j<k ||j==newcapacity-1){
      lin[j]=null;
     }
     else{
       lin[j]=newArray[i];
       i++;
     }
   }
     cir=lin;
   }
  public void resizeByLinearize(int newcapacity){
   int k=start;
   int i;
   Object [] newArray=new Object[cir.length];
   for(i=0;i<newArray.length;i++){
     newArray[i]=cir[k];
     k=(k+1)%cir.length;
   }
     Object [] lin=new Object[newcapacity];
     
   for(int j=0;j<newArray.length;j++){
     lin[j]=newArray[j];
     
   }
   cir=lin;
  }
 public void insertByRightShift(Object elem, int pos){
   int k=start;
   int i;
   Object [] newArray=new Object[cir.length];
   for(i=0;i<newArray.length;i++){
     newArray[i]=cir[k];
     k=(k+1)%cir.length;
   }
  Object [] lin=new Object[newArray.length+1];
     
   for(int j=0;j<newArray.length;j++){
     lin[j]=newArray[j];
     
   }
   for(i=size-1;i>=pos;i--){
     lin[i+1]=lin[i];
   }
    lin[pos]=elem;
    int j=0;
    Object [] temp =new Object[lin.length+2];
    for(i=2;i<temp.length;i++){
     temp[i]=lin[j];
       j++;
     }
   
   cir=temp;
  }
  public void insertByLeftShift(Object elem, int pos){
    int nshift=pos+1;
    int from=start;
    int to =from-1;
    if(to<0){
      to=cir.length-1;
    }
    for(int i=0;i<nshift;i++){
      cir[to]=cir[from];
      to=from;
      from=(from+1)%cir.length;
      
      if(start<0){
        start=cir.length-1;
      }
    }
    int index =(start+pos)%cir.length;
      cir[index]=elem;
      size++;
      start--;
  }
  public void removeByLeftShift(int pos){
    int nshift = size-(pos+1);
    int to=(start+pos)%cir.length;
    int from =(to+1)%cir.length;
    for(int i=0;i<=nshift;i++){
      cir[to]=cir[from];
      to=from;
      from=(from+1)%cir.length;
      
      size--;
    }
  }
 public void removeByRightShift(int pos){
  int nshift =pos;
   int to=(start+pos)%cir.length;
   int from = to-1;
   if(from<0){
     from=cir.length-1;
   }
   for(int i=0;i<nshift;i++){
     cir[to]=cir[from];
     to=from;
     from--;
     }
   if(from<0){
     from=cir.length-1;
  }
   cir[start]=null;
   size--;
   start=(start+1)%cir.length;
  }
}