package id.ac.unand.fti.si.pbo;

public interface CanDeposit {
    public Integer cekSaldo();
    public Integer deposit(Integer jumlahDeposit);
    public Integer tarikTunai(Integer jumlahTarikTunai);
}
