package com.live.coding.javas.objects.equals;

 /**
  * https://stackoverflow.com/questions/4568896/difference-between-object-reference-and-object-hash-code
  * http://net-informations.com/java/cjava/hash.htm
  * https://srvaroa.github.io/jvm/java/openjdk/biased-locking/2017/01/30/hashCode.html
  * https://www.infoworld.com/article/3305792/comparing-java-objects-with-equals-and-hashcode.html
  * https://www.baeldung.com/java-equals-hashcode-contracts
  * https://javarevisited.blogspot.com/2015/01/why-override-equals-hashcode-or-tostring-java.html#axzz7LjXwEXeM
  * https://javarevisited.blogspot.com/2015/01/why-override-equals-hashcode-or-tostring-java.html#axzz7LjXwEXeM
  * https://javarevisited.blogspot.com/2012/12/difference-between-equals-method-and-equality-operator-java.html#axzz7LjXwEXeM
  * */

public class EqualsTest {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));

    }
}
