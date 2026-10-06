package view;

import model.SalaryHistory;
import model.Worker;
import model.WorkerList;

public class ConsoleForm {
    public Worker inputWorker(){
        Worker WK = new Worker();
        DataInput DI = new DataInput();

        System.out.print("Enter Code: ");
        WK.setCode(DataInput.inputString());

        System.out.print("Enter Name: ");
        WK.setName(DataInput.inputString());

        System.out.print("Enter Age: ");
        WK.setAge(DI.GetIntInRange("", 18, 50));

        System.out.print("Enter Salary: ");
        WK.setSalary(DataInput.inputPositiveDouble());

        System.out.print("Enter work location: ");
        WK.setLocation(DataInput.inputString());

        return WK;
    }

    public String inputCode(){
        System.out.println("------- Up/Down Salary --------");
        System.out.print("Enter Code: ");
        return DataInput.inputString();
    }

    public double inputAmount(){
        System.out.print("Enter Salary: ");
        return DataInput.inputPositiveDouble();
    }

    public void showSalaryInfo(WorkerList WL){
        System.out.println("-------------- Display Information Salary --------------");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n",
                "Code", "Name", "Age", "Salary", "Status", "Date");

        for (Worker w : WL.getWL()){
            for (SalaryHistory h : w.getSL()){
                System.out.printf("%-15s%-15s%-15d%-15.0f%-15s%-15s%n",
                        w.getCode(), w.getName(), w.getAge(),
                        h.getSalary(), h.getStatus(), h.getDate());
            }
        }
    }
}
