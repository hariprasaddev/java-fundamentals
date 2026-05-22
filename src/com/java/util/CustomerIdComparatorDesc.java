package com.java.util;

import com.java.Collections.map.Customer;

import java.util.Comparator;

public class CustomerIdComparatorDesc implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return Integer.compare(o2.id, o1.id);
    }
}

