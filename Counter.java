class Counter{
    int value;
    int modulo;
    int counter;
    int reset;

    Counter(){this(0,0);}

    Counter(int value, int modulo){
      this.value=value;
      this.modulo=modulo;
      this.counter=value%modulo;
      this.reset=this.value/this.modulo;
    }

    void inc(){
      this.value++;
      this.counter=(this.counter+1)%this.modulo;
      this.reset=this.value/this.modulo;
    }

    public String toString(){
        return String.format("%d:%d:%d:%d",value,modulo,counter,reset);

    }
}
