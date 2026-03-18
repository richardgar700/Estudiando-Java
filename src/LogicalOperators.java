//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   /*
   int temperature = 22;
   boolean isWarm = temperature > 20 && temperature < 30;
    System.out.println(isWarm);

    */
//java evalua esta expresion desde la izquierda hasta la derecha
    boolean hasHighIncome = false;
    boolean hasGoodCredit = true;
    boolean hasCriminalRecord = false;
    boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
    System.out.println(isEligible);
}


