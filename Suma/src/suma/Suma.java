package suma;
public class Suma {
    public static void main(String[] args) {
        double ope1,ope2,r;
        String ops1,ops2;
        JOptionPane.showMessageDialog(null, "Suma");
        ops1=JOptionPane.ShowInputDialog("ingresa el primer numero");
        ope1=Double.parseDouble (ops1);
        ops2=JOptionPane.ShowInputDialog("ingresa el segundo numero");
        ope2=Double.parseDouble(ops2);
        r=ope1+ope2;
        JOptionPane.ShowMessageDialog(null,"suma=" +r);
         }
    
}
