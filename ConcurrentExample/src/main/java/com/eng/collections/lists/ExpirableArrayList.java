package com.eng.collections.lists;

import java.util.*;

public class ExpirableArrayList<E> extends ArrayList<E> {

    private final Date creation = new Date();

    private final long timeToLiveInMs;

    public ExpirableArrayList(long timeToLiveInMs, int initialCapacity) {
        super(initialCapacity);
        this.timeToLiveInMs = timeToLiveInMs;
    }

    public ExpirableArrayList(long timeToLiveInMs) {
        this.timeToLiveInMs = timeToLiveInMs;
    }

    public ExpirableArrayList(long timeToLiveInMs, Collection<? extends E> c) {
        super(c);
        this.timeToLiveInMs = timeToLiveInMs;
    }

    private void expire() {
        if (System.currentTimeMillis() - creation.getTime() > timeToLiveInMs) {
            clear();
        }
    }

    @Override
    public int size() {
        expire();
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        expire();
        return super.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        expire();
        return super.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        expire();
        return super.iterator();
    }

    @Override
    public Object[] toArray() {
        expire();
        return super.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        expire();
        return super.toArray(a);
    }

    @Override
    public boolean add(E e) {
        expire();
        return super.add(e);
    }

    @Override
    public boolean remove(Object o) {
        expire();
        return super.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        expire();
        return super.contains(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        expire();
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        expire();
        return super.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        expire();
        return super.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        expire();
        return super.retainAll(c);
    }

    @Override
    public E get(int index) {
        expire();
        return super.get(index);
    }

    @Override
    public E set(int index, E element) {
        expire();
        return super.set(index, element);
    }

    @Override
    public E remove(int index) {
        expire();
        return super.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        expire();
        return indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        expire();
        return lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        expire();
        return listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        expire();
        return listIterator();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        expire();
        return subList(fromIndex, toIndex);
    }
}
