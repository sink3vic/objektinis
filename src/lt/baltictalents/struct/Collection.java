package lt.baltictalents.struct;

/**
 * Abstraktus „daiktų“ rinkinys – tai gali būti objektų sąrašas, aibė, atvaizdis ir pan..
 * <ul>Jis turi tokias savybes:
 *  <li>Gali išvardyti savo elementus.</li>
 *  <li>Gali pasakyti, ar turi tokį savyje.</li>
 *  <li>Gali pasakyti, ar turi tuos pačius elementus, kaip kitas rinkinys.</li>
 *  <li>Gali sukurti identišką savęs paties kopiją</li>
 * </ul>
 */
public interface Collection<T extends Object> extends Comparable, Cloneable{
  boolean contains(T elementas);
  int size();
  Collection<T> clone() throws CloneNotSupportedException;
  boolean equals(Collection kitas);
  Sequence<T> items();

}

