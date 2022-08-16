**Stream Api nedir?**

Java 8 ile birlikte gelen Stream Api desteği, veriler üzerinde yapacağımız işlemleri temiz ve anlaşılır bir şekilde ifade edebilmemize olanak sağlıyor.

**filter()**

Filtreleme işlemi yapmamızı sağlar, verilen kriterlere göre arama yapar. Bu filtreleme birden fazla şekilde de yapabilir. startsWith baş harfine göre arama yapar.
List<String> name = Arrays.asList("Mert", "Hülya", "Ahmet");
List result = name.stream().filter(s -> s.startsWith("H")).collect(Collectors.toList());
System.out.println(result);
  
Result [Hülya] döner.
  
  
**sorted()**
  
Sıralama yapmamızı sağlar. Yazı ise harf sırası ( sözlük mantığı şeklinde ) sayı ise küçükten büyüğe.
List<String> name = Arrays.asList("Mert", "Hülya", "Ahmet");
List<String> test = name.stream().sorted().collect(Collectors.toList());
System.out.println(test);
  
Result [Ahmet,Hülya,Mert] döner.

**map()**
  
Stream içerisinde ki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak için Map kullanılmaktadır.
Burada Yusuf ve Çakal adında iki String imiz var. map() ile Liste deki her Liste elemanına ekleme yaptım.
List<String> name = Arrays.asList("Mert", "Ahmet");
name.stream().map(s -> "First " + s + 
" Second").forEach(System.out::println);
  
 Result
  
First Mert Second
  
First Ahmet Second, döner.
