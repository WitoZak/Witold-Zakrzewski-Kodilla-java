package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Invoice invoice = new Invoice("1");

        Item item1 = new Item(new BigDecimal("100.00"), 1, new BigDecimal("100.00"));
        Item item2 = new Item(new BigDecimal("200.00"), 2, new BigDecimal("400.00"));

        item1.setProduct(product1);
        item2.setProduct(product2);

        product1.getItem().add(item1);
        product2.getItem().add(item2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);


        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        assertNotEquals(0, invoiceId);

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceId);
        } catch (Exception e) {
            // do nothing
        }
    }
}
