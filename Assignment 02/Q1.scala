
object Q1 extends App{
def normal_salary(hours:Int):Int=150*hours;

def OT_salary(hours:Int):Int=75*hours;

def tax_calc(normal_pay:Int,ot_pay:Int):Double = (normal_pay+ot_pay)*0.1;

def take_home_salary(normal_hrs:Int,ot_hrs:Int):Double=normal_salary(normal_hrs)+OT_salary(ot_hrs)-tax_calc(normal_salary(normal_hrs),OT_salary(ot_hrs));

println(take_home_salary(40,20));

}