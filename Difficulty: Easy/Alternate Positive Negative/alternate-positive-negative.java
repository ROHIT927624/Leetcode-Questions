class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>=0){
                pos.add(arr.get(i));
            }else{
                neg.add(arr.get(i));
            }
        }
        
        int posidx=0,negidx=0;
        int i=0;
        
        while(posidx<pos.size()&&negidx<neg.size()){
            if(i%2==0){
                arr.set(i++,pos.get(posidx++));
            }else{
                arr.set(i++,neg.get(negidx++));
            }
        }
        
        while (posidx < pos.size())
            arr.set(i++, pos.get(posidx++));

        while (negidx < neg.size())
            arr.set(i++, neg.get(negidx++));
    }
}