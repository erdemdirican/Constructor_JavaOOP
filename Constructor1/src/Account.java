
public class Account {
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private int telNo;
    
    public Account(){
        System.out.println("Bizim oluşturduğumuz constructor");
    }
    
    public Account(String hesapNo, double bakiye, String isim, String email, int telNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telNo = telNo;
    }
    
    public void paraCek(double miktar){
        if(miktar > 1500){
            System.out.println("Bir günde 1500 TL'den fazla para çekemezsiniz...");
        }
        if(bakiye - miktar < 0){
            System.out.println("Yeterli bakiyeniz bulunmamaktadır... Bakiyeniz: " + bakiye);
        }
        else{
            bakiye = bakiye - miktar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
        }
    }
    
    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telNo
     */
    public int getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(int telNo) {
        this.telNo = telNo;
    }
    
}
