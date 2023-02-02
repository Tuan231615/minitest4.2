package Controller;

import model.CrispyFlour;
import model.Material;
import model.Meat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaterialManager {
    List<Material> materials;
    public MaterialManager() {
        materials = new ArrayList<>();
    }

    public MaterialManager(List<Material>materials) {
        this.materials = materials;
    }
//CRUD
    public void display() {
        for (Material material : materials) {
            System.out.println(material);
        }
    }

    public double totalPriceMeat() {
        double priceMeat = 0;
        double totalMoneyMeatSale = 0;
        for (Material material : materials) {
            if (material instanceof Meat) {
                priceMeat += material.getRealMoney();
                totalMoneyMeatSale += (material.getAmount() - material.getRealMoney());
            }
        }
        return totalMoneyMeatSale;
    }

    public double totalPriceCrispyFlour() {
        double priceCrispyFlour = 0;
        double totalScrispyFlourSale = 0;
        for (Material material : materials) {
            if (material instanceof CrispyFlour) {
                priceCrispyFlour += material.getRealMoney();
                totalScrispyFlourSale += (material.getAmount() - material.getRealMoney());
            }
        }
        return totalScrispyFlourSale;
    }

    int index;
    Scanner input = new Scanner(System.in);

    public void addElement(Material material) {
        materials.add(material);
    }
    public void editElement(Material material) {
        System.out.print("Nhập vị trí muốn sửa: ");
        index = input.nextInt();
        for (int i = 0; i < materials.size(); i++) {
            if (i == index) {
                materials.set(i, material);
            }
        }
    }

    public void deleteElement() {
        System.out.print("Nhập vị trí muốn xóa: ");
        index = input.nextInt();
        for (int i = 0; i < materials.size(); i++) {
            if (i == index) {
                materials.remove(i);
            }
        }
    }
}
