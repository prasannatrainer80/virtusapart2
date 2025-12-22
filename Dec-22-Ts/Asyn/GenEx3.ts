export class GenEx3<K,V> {
    private store = new Map<K, V>();

    set(key : K, value : V) : void {
        this.store.set(key,value);
    }

    get(key : K) : V {
        return this.set.arguments(key);
    }

}

const obj1 = new GenEx3<number,string>();
obj1.set(1, "Prasanna");

const obj2 = new GenEx3<string,boolean>();
obj2.set("Raj",true);
