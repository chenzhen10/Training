class Task1 {
    private int eyes = 2 ;

   public int getCountOfHeads(int age){
       int heads = 3;
       if(age < 200){
           heads *= age;//макс 597 голов за 199 лет
       }else if(age < 300){
           heads = heads * 199 + 2 *(age-199);//С 200 по 299 200 головы
       }else {
           heads = heads * 199 + 2 * 100 + (age - 299);
       }
       return  heads;
    }

    public String getCountOfEyes(int age){
        return "Коллиечство глаз : " + eyes * (getCountOfHeads((age)));
    }

}
