package com.example.demo.refs;

/**
 * Created by krrishnaaaa on September 10, 2016
 */
public class RefDemo {
    public static void main(String[] args) {
        Bar b1 = new Bar(1, "bar");
        Bar b2 = new Bar(1, "bar");

        // false: value stored in b1 and b2 are different
        // b1 and b2 contains address of the memory assigned
        System.out.println(b1 == b2);

        // false: only if equals() and hashCode() is not override in Bar
        // true: only if equals() and hashCode() is override in Bar
        System.out.println(b1.equals(b2));
    }

    private static class Bar {
        private int value;
        private String foo;

        public Bar(int value, String foo) {
            this.value = value;
            this.foo = foo;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getFoo() {
            return foo;
        }

        public void setFoo(String foo) {
            this.foo = foo;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Bar bar = (Bar) o;

            if (value != bar.value) return false;
            return foo != null ? foo.equals(bar.foo) : bar.foo == null;

        }

        @Override
        public int hashCode() {
            int result = value;
            result = 31 * result + (foo != null ? foo.hashCode() : 0);
            return result;
        }
    }
}
