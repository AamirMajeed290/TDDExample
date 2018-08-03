package example.code.tddexample;

public class SimpleSet {
    private int[] container=new int[10];
    private int addedElement=0;
    public boolean isEmpty() {

        return addedElement==0;
    }

    public boolean addElement(int i) {
        //add element and then ++
       if(this.contains(i)) return false;


        container[addedElement++]=i;
        return true;

    }


    public int elementCount() {
        return addedElement;
    }

    public boolean contains(int i) {

       for(int j=0;j<container.length;j++)
       {
           if(container[j]==i)
           {
               return true;
           }

       }
       return false;
    }

    public void removeElement(int i) {

       for(int j=0;j<container.length;j++)
       {
           if(container[j]==i)
           {
               for(int k=j;k<container.length-1;k++)
               {

                   container[k]=container[k+1];
               }
               addedElement--;
           }
       }

    }
}
