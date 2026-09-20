package model;

import java.util.ArrayList;

public class DoctorList {
    private ArrayList<Doctor> DL = new ArrayList<>();

    public ArrayList<Doctor> getList(){
        return DL;
    }

    public Doctor findByCode(String code) {
        for (Doctor d : DL) {
            if (d.getCode().equals(code)) {
                return d;
            }
        }
        return null;
    }

    public boolean addDoctor(Doctor doctorlink) {
        if (findByCode(doctorlink.getCode()) != null) {
            System.out.println("Code already existed.");
            return false;
        }
        DL.add(doctorlink);
        System.out.println("Done");
        return true;
    }

    public boolean updateDoctor(String code, String newName, String newSpec, String newAvailability) {
        Doctor d = findByCode(code);
        if (d == null) {
            return false;
        }

        if (!newName.isEmpty())
            d.setName(newName);

        if (!newSpec.isEmpty())
            d.setSpec(newSpec);

        if (!newAvailability.isEmpty())
            d.setAvailability(Integer.parseInt(newAvailability));
        return true;
    }

    public boolean deleteDoctor(String code) {
        Doctor d = findByCode(code);
        if (d == null) {
            System.out.println("Doctor code does not exist");
            return false;
        }
        DL.remove(d);
        System.out.println("Successful");
        return true;
    }
}
