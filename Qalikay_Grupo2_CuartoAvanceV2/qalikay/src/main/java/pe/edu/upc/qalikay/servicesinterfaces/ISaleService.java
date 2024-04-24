package pe.edu.upc.qalikay.servicesinterfaces;

import pe.edu.upc.qalikay.entities.Sale;

import java.time.LocalDate;
import java.util.List;

public interface ISaleService {
    public void insert(Sale sale);
    public List<Sale> list();
    public void delete(int id);
    public Sale listId(int id);
    public List<String[]> quantitySaleByUser();
    long sumTotalSales();
    public List<Sale>findSalesBySaleDateEquals(LocalDate date);

    public List<Object[]> getUsersWithMostSales(LocalDate Dia_inicial, LocalDate Dia_final);

}
