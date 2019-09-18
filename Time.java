class Time{
    Counter hour;
    Counter minute;
    Counter second;

    Time(){this(0,0,0);}

    Time(int hour,int minute,int second){
      this.second= new Counter(second,60);
      this.minute= new Counter(minute+this.second.reset,60);
      this.hour= new Counter(hour+this.minute.reset,24);

    }


    void tick(){
      this.second.inc();
      if (this.second.counter==0){
        this.minute.inc();
        if (this.minute.counter==0){
            this.hour.inc();
      }
    }
}

    public String toString(){
        return String.format("%d:%d:%d",this.hour.counter,this.minute.counter,this.second.counter);

    }

    public static void main(String[] args){
      Time t=new Time(72,90,0);
      t.tick();
      System.out.println(t.toString());
    }
}
