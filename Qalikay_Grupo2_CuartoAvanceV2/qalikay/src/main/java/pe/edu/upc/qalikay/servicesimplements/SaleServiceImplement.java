package pe.edu.upc.qalikay.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.Sale;
import pe.edu.upc.qalikay.repositories.ISaleRepository;
import pe.edu.upc.qalikay.servicesinterfaces.ISaleService;

import java.time.LocalDate;
import java.util.List;

@Service
public class SaleServiceImplement implements ISaleService {
    @Autowired
    private ISaleRepository sR;
    @Override
    public void insert(Sale sale){
        sR.save(sale);
    }

    @Override
    public List<Sale> list(){
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public Sale listId(int id) {
        return sR.findById(id).orElse(new Sale());
    }

    @Override
    public List<String[]> quantitySaleByUser() {
        return sR.quantitySaleByUser();
    }

    @Override
    public long sumTotalSales() {
        return sR.sumTotalSales();
    }

    @Override
    public List<Sale> findSalesBySaleDateEquals(LocalDate date) {
        return sR.findSalesBySaleDateEquals(date);
    }

    @Override
    public List<Object[]> getUsersWithMostSales(LocalDate Dia_inicial, LocalDate Dia_final) {
        return sR.findTopUsersWithMostSales(Dia_inicial, Dia_final);
    }
}
