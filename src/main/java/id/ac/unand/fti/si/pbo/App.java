package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {
        //objek
        MemberReguler member1 = new MemberReguler();
        MemberSilver member2 = new MemberSilver();
        MemberGold member3 = new MemberGold();
        MemberPlatinum member4 = new MemberPlatinum();

        //hitungtotalbayar
        Integer hargaReguler = member1.hitungTotalBayar(12000);
        Integer hargaSilver = member2.hitungTotalBayar(12000);
        Integer hargaGold = member3.hitungTotalBayar(12000);
        Integer hargaPlatinum = member4.hitungTotalBayar(12000);
        
        //hitungongkir
        Integer ongkirSilver = member2.hitungOngkir(12.0);
        Integer ongkirGold = member3.hitungOngkir(12.0);
        Integer ongkirPlatinum = member4.hitungOngkir(12.0);

        //hitungcicilan
        Integer cicilanGold = member3.hitungCicilanPerBulan(hargaGold, 5);
        Integer cicilanPlatinum = member4.hitungCicilanPerBulan(hargaPlatinum, 5);

        //inputsaldo
        Integer saldo = member4.deposit(12000);

        //output
        System.out.println("Total Bayar Reguler : " + hargaReguler);
        System.out.println("Total Bayar Silver : " + hargaSilver);
        System.out.println("Total Ongkir Silver : " + ongkirSilver);
        System.out.println("Total Bayar Gold : " + hargaGold);
        System.out.println("Total Ongkir Gold : " + ongkirGold);
        System.out.println("Cicilan Gold : " + cicilanGold );
        System.out.println("Total Bayar Platinum : " + hargaPlatinum);
        System.out.println("Total Ongkir Platinum : " + ongkirPlatinum);
        System.out.println("Cicilan Platinum : " + cicilanPlatinum );
        System.out.println("Saldo : " + saldo);
    }
        }
