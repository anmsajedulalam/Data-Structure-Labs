

package CircularArray;

public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
      cir=new Object[lin.length];
      start=st;
      size=sz;
      int s=st+1;
      for(int i=0;i<lin.length;i++){
          if(s==lin.length){
              s=0;
          }
          
          cir[i]=lin[s];
          s++;
      }
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
      for(int i=0;i<cir.length;i++){
          System.out.print(cir[i]+" ");
      }
      System.out.println();
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
     int pos=start;
     for(int i=0;i<size;i++){
         if(pos==cir.length){
             pos=0;
         }
         System.out.print(cir[pos]+" ");
         pos++;
     }
     System.out.println();
  }
  
  
  public void printBackward(){
   int pos=0;
   for(int i=0;i<size;i++){
       if(pos<0){
           pos=cir.length-1;
       }
       
       System.out.print(cir[pos]+" ");
       pos--;
   }
   System.out.println();
  }
  
  // With no null cells
  public void linearize(){
     int pos=start;
     Object temp[]=new Object[size];
     for(int i=0;i<size;i++){
         if(pos==cir.length){
             pos=0;
         }
         temp[i]=cir[pos];
         pos++;
     }
     cir=temp;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    Object []temp=new Object[newcapacity];
    int pos=start;
    int tmp=start;
    for(int i=0;i<size;i++){    
        temp[tmp]=cir[pos];
        pos=(pos+1)%cir.length;
        tmp=(tmp+1)%newcapacity;
    }
    cir=temp;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    Object temp[]=new Object[newcapacity];
    int pos=start;
    int tmp=0;
    for(int i=0;i<size;i++){
        temp[tmp]=cir[pos];
        pos=(pos+1)%cir.length;
        tmp=(tmp+1)%newcapacity;
    }
    cir=temp;
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    if(size==cir.length){
        resizeStartUnchanged(size+3);
    }
   int nshift=size-pos;
    int from=(start+size-1)%cir.length;
    int to=(from+1)%cir.length;
    
    for(int i=0;i<nshift;i++){
        cir[to]=cir[from];
        to=from;
        from--;
        if(from<0){
            from=cir.length-1;
        }
    }
    
    int idx=(pos+start)%cir.length;
    cir[idx]=elem;
    
  }
  
  public void insertByLeftShift(Object elem, int pos){
    if(size==cir.length){
        resizeStartUnchanged(size+3);
    }
    int nshift=pos+1;
    int from=start;
    int to=from-1;
    if(to<0){
        to=cir.length-1;
    }
    for(int i=0;i<nshift;i++){
        cir[to]=cir[from];
        to=from;
        from=(from+1)%cir.length;
    }
    int idx=(pos+start)%cir.length;
    cir[idx]=elem;
    start--;
    size++;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    int nshift=size-(pos+1);
    int to=(start+pos)%cir.length;
    int from=(to+1)%cir.length;
    for(int i=0;i<nshift;i++){
        cir[to]=cir[from];
    }
    int idx=(start+size-1)%cir.length;
    cir[idx]=null;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    int nshift=pos;
    int to=(start+pos)%cir.length;
    int from=(to-1);
    if(from<0){
        from=cir.length-1;
    }
    for(int i=0;i<nshift;i++){
        cir[to]=cir[from];
        to=from;
        from--;
        if(from<0){
        from=cir.length-1;
        }
    }
    cir[start]=null;
    start=(start+1)%cir.length;
    size--;
  }
}