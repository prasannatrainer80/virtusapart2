export class GenEx3<K, V> {
    private store = new Map<K, V>();

    set(key: K, value: V): void {
        this.store.set(key, value);
    }

    get(key: K): V | undefined {
        return this.store.get(key);
    }
}

// usage
const obj = new GenEx3<number, string>();
obj.set(1, "Prasanna");

console.log(obj.get(1)); // Prasanna
