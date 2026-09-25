package model;

import java.util.ArrayList;

public class WorkerList {
    private ArrayList<Worker> WL = new ArrayList<>();

    public ArrayList<Worker> getWL(){
        return WL;
    }

    public Worker findByCode(String code) {
        for (Worker w : WL) {
            if (w.getCode().equals(code)) {
                return w;
            }
        }
        return null;
    }

    public boolean addWorker(Worker workerlink){
        if (findByCode(workerlink.getCode()) != null){
            System.out.println("Code already existed.");
            return false;
        }
            return WL.add(workerlink);
    }

    public boolean changeSalary(String status, String code, double amount) {
        Worker w = findByCode(code);
        if (w == null) {
            return false;
        }

        if (status.equals("UP")) {
            w.setSalary(w.getSalary() + amount);
        }
        else {
            w.setSalary(w.getSalary() - amount);
        }

        w.addSalary(new SalaryHistory(w.getSalary(), status));
        return true;
    }
}
