# 📚 Java Collections Revision – ArrayList, LinkedList, Iterator & ListIterator

This repository contains practice examples to master **ArrayList, LinkedList, Iterator, and ListIterator** concepts for interviews.

---

# 🚀 1. What is Collection Framework?

The **Java Collections Framework (JCF)** is a set of classes and interfaces used to store and manipulate groups of data.

👉 Key Interfaces:

* List
* Set
* Map

👉 In this repo, we focus on **List implementations**.

---

# 📌 2. ArrayList

## 🔹 Definition

ArrayList is a **resizable array** implementation of the List interface.

## 🔹 Key Features

* Maintains insertion order
* Allows duplicates
* Fast random access (O(1))
* Dynamic resizing

## 🔹 Basic Example

```java
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Vaibhav");
        list.add("Shreya");
        list.add("Vivek");

        System.out.println(list);
    }
}
```

---

# 📌 3. LinkedList

## 🔹 Definition

LinkedList is a **doubly linked list** implementation of List and Deque.

## 🔹 Key Features

* Each element is stored in a node (prev + data + next)
* Efficient insertion/deletion
* Slower access (O(n))

## 🔹 Basic Example

```java
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.addFirst("Start");
        list.addLast("End");

        System.out.println(list);
    }
}
```

---

# ⚡ 4. ArrayList vs LinkedList (IMPORTANT)

| Feature            | ArrayList     | LinkedList            |
| ------------------ | ------------- | --------------------- |
| Internal Structure | Dynamic Array | Doubly Linked List    |
| Access             | O(1) ✅        | O(n) ❌                |
| Insertion          | O(n) ❌        | O(1)* ✅               |
| Deletion           | O(n) ❌        | O(1)* ✅               |
| Memory             | Less          | More (extra pointers) |
| Use Case           | Read-heavy    | Write-heavy           |

👉 *O(1) only when node reference is available*

---

# 🔁 5. Iterator

## 🔹 Definition

Iterator is used to **traverse and safely modify** a collection.

## 🔹 Why needed?

To avoid **ConcurrentModificationException** when removing elements during iteration.

## 🔹 Methods

* hasNext()
* next()
* remove()

## 🔹 Example (Removing Even Numbers)

```java
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            if(it.next() % 2 == 0) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
```

---

# 🔄 6. ListIterator

## 🔹 Definition

ListIterator is an advanced iterator that allows:

* Forward traversal
* Backward traversal
* Modification of elements

## 🔹 Methods

* hasNext(), next()
* hasPrevious(), previous()
* add(), set(), remove()

## 🔹 Example

```java
import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        ListIterator<String> it = list.listIterator();

        while(it.hasNext()) {
            String val = it.next();
            if(val.equals("B")) {
                it.set("Updated");
            }
        }

        System.out.println(list);
    }
}
```

---

# ⚠️ 7. Common Mistakes

## ❌ Removing inside for-each loop

```java
for(Integer i : list) {
    list.remove(i); // ❌ Throws exception
}
```

## ✅ Correct way

```java
Iterator<Integer> it = list.iterator();
```

---

# 🔧 8. Important Methods Summary

## ArrayList

```java
add()
get()
set()
remove()
size()
```

## LinkedList

```java
addFirst()
addLast()
removeFirst()
removeLast()
getFirst()
getLast()
```

---

# 🧠 9. Key Interview Points

* ArrayList → Fast access, slow modification
* LinkedList → Slow access, fast modification
* Iterator → Safe removal
* ListIterator → Bidirectional traversal

👉 Golden Line:

> "Use ArrayList for fast access and LinkedList for frequent insertions/deletions."

---

# 🎯 10. Final Revision Trick

```
ArrayList → Access fast, Modify slow  
LinkedList → Access slow, Modify fast  
```


⭐ **Tip:** Revise this README once before every interview for quick recall.
