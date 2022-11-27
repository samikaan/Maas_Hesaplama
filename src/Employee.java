public class Employee {
    String name;
    double Salary;
    double worksHours;
    int hireYear;
    double BonusUcret;
    double Tax;
    int year = 2021;
    double zam;
    double MaasArt;
    double newSallary;
    double TaxAndBonus;

       double Tax () {
        if(this.Salary >= 1000){
             Tax = (this.Salary*3/100);
            //System.out.println("%3'lük vergi uygulandı." + "Ödenen Vergi:"+Tax);
        } else {
            Tax = 0;
            //System.out.println("Vergi uygulanmadı.");
        }
        return Tax;
    }
    double Bonus () {
        if (this.worksHours > 40) {
            BonusUcret = (this.worksHours-40) * 30;
            //System.out.println("Bonus ücreti: " + BonusUcret);
        }
        else {
            BonusUcret = 0;
            //System.out.println("Mesai saati 40 saati geçemediği için fazla mesai ücreti hesaplanmadı.");
                    }
        return BonusUcret;
    }
    double raiseSalary(){
        if ((year-this.hireYear)< 10){
                zam = (this.Salary*5/100);
                    }
        if ((year-this.hireYear)>9 && (year-this.hireYear)<20){
            zam = (this.Salary*10/100);
        }
        if ((year-this.hireYear) > 19){
            zam = (this.Salary*15/100);
        }
        else {
            //System.out.println("Zam Hesaplanmadı");
        }
        return zam;
    }
    double TaxAndBonus(){
        return TaxAndBonus = -Tax+BonusUcret+Salary;

    }
    double newSallary(){
        return newSallary = Salary+zam-Tax+BonusUcret;

    }

    Employee (String name, double Salary, double worksHours, int hireYear) {
        this.name = name;
        this.Salary = Salary;
        this.worksHours = worksHours;
        this.hireYear = hireYear;
        this.Tax = Tax();
        this.BonusUcret=Bonus();
        this.MaasArt=raiseSalary();
        this.TaxAndBonus=TaxAndBonus();
        this.newSallary=newSallary();

        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + Salary);
        System.out.println("Çalışma Saati: " + worksHours);
        System.out.println("Başlangıç Yılı: " + hireYear);
        System.out.println("Vergi: " + this.Tax);
        System.out.println("Bonus: " + this.BonusUcret);
        System.out.println("Maaş Artışı: " + MaasArt);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + this.TaxAndBonus);
        System.out.println("Toplam Maaş " + this.newSallary );
    }


}
