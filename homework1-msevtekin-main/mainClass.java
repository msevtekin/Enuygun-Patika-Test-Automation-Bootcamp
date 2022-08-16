/* Abstraction, gereksiz ayrıntıları gizlememize ve yalnızca gerekli bilgileri göstermemize olanak tanıyan önemli bir nesne yönelimli programlama kavramıdır
-Abstract method implemantasyon içermez
-Abstract methodlar içeren bir sınıf da abstract olmalıdır.
-Abstract sınıfın nesnelerini olusturamayiz.
-Bir alt sınıf, abstract bir sınıfın abstract  methodlarını override etmelidir.

.*/


abstract class MotorBike {
    abstract void brake();
}

class SportsBike extends MotorBike {

    // abstract methodu implemente ettik
    public void brake() {
        System.out.println("SportsBike Brake");
    }
}

class MountainBike extends MotorBike {

    // abstract methodu implemente ettik
    public void brake() {
        System.out.println("MountainBike Brake");
    }
}

class Main {
    public static void main(String[] args) {
        MountainBike m1 = new MountainBike(); //Mountainbike sınıfından nesne ürettik
        m1.brake(); //implemente ettigimiz methodumuzu cagırdık
        SportsBike s1 = new SportsBike(); //SportsBike sınıfından nesne ürettik
        s1.brake(); //implemente ettigimiz methodumuzu cagırdık
    }
}

/* 
Pratik bir soyutlama örneği, motosiklet frenleri olabilir.
Frenlerin ne yaptığını biliyoruz. Frene bastığımızda motosiklet duracaktır. Ancak frenin çalışması bizden gizli tutulur.
Fren çalışmasını gizlemenin en büyük avantajı, artık üreticinin farklı motosikletler için farklı fren uygulayabilmesidir, ancak frenin yaptığı şey aynı olacaktır.

brake() methodunu MotorBike içinde uygulayamayız çünkü her model motor farklı fren uygulamalarına sahiptir. (Mesela Spor motorlar için virajda daha sert frenleme diski yapılması gibi..)


*/