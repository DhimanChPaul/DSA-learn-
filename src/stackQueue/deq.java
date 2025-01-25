package stackQueue;

import java.util.ArrayDeque;
//import java.util.Collection;
import java.util.Deque;
//import java.util.Iterator;

public class deq {
    public static void main(String[] args) {
        Deque<Integer> a= new ArrayDeque<>();//Deque<Integer>();
        a.add(45);
        a.add(55);
        a.add(65);
        a.addFirst(35);
        a.addLast(75);

        System.out.println(a.peek());
        System.out.println(a.peekLast());
// deque is array type quere which can be work like as an array
        // it can add ,pop ,peek in both the direction
        /*{
            @Override
            public void addFirst(Integer integer) {

            }

            @Override
            public void addLast(Integer integer) {

            }

            @Override
            public boolean offerFirst(Integer integer) {
                return false;
            }

            @Override
            public boolean offerLast(Integer integer) {
                return false;
            }

            @Override
            public Integer removeFirst() {
                return null;
            }

            @Override
            public Integer removeLast() {
                return null;
            }

            @Override
            public Integer pollFirst() {
                return null;
            }

            @Override
            public Integer pollLast() {
                return null;
                     }

            @Override
            public Integer getFirst() {
                return null;
                     }

            @Override
            public Integer getLast() {
                return null;
                     }

            @Override
            public Integer peekFirst() {
                return null;
                      }

            @Override
            public Integer peekLast() {
                return null;
                  }

            @Override
            public boolean removeFirstOccurrence(Object o) {
                return false;
                  }

            @Override
            public boolean removeLastOccurrence(Object o) {
                return false;
                  }

            @Override
            public boolean add(Integer integer) {
                return false;
                  }

            @Override
            public boolean offer(Integer integer) {
                return false;
                    }

            @Override
            public Integer remove() {
                return null;
                 }

            @Override
            public Integer poll() {
                return null;
                }
            public Integer element() {
                return null;
                 }
            public Integer peek() {
                return null;
                }
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
                }
            public void push(Integer integer) {

            }
            public Integer pop() {
                return null;
            }
            public boolean remove(Object o) {
                return false;
            }
            public boolean contains(Object o) {
                return false;
            }
            public int size() {
                return 0;
            }
            public Iterator<Integer> iterator() {
                return null;
            }
            public Iterator<Integer> descendingIterator() {
                return null;
            }
            public boolean isEmpty() {
                return false;
            }
            public Object[] toArray() {
                return new Object[0];
            }
            public <T> T[] toArray(T[] a) {
                return null;
            }
            public boolean containsAll(Collection<?> c) {
                return false;
            }
            public boolean removeAll(Collection<?> c) {
                return false;
            }
            public boolean retainAll(Collection<?> c) {
                return false;
            }
            public void clear() {

            }
        }*/
    }
}
