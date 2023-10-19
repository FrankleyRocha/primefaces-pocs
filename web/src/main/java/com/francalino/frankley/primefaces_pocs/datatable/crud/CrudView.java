package com.francalino.frankley.primefaces_pocs.datatable.crud;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import org.primefaces.PrimeFaces;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@ViewScoped
public class CrudView implements Serializable {

    private static final long serialVersionUID = 8960929479237450426L;

	private List<Row> rows;

    private Row selectedRow;

    private List<Row> selectedRows;

    @Inject
    private RowService rowService;
    
    @PostConstruct
    public void init() {
        this.rows = this.rowService.getClonedRows(100);                        
    }

    public List<Row> getRows() {
        return rows;
    }

    public Row getSelectedRow() {
        return selectedRow;
    }

    public void setSelectedRow(Row selectedRow) {
        this.selectedRow = selectedRow;
    }

    public List<Row> getSelectedRows() {
        return selectedRows;
    }

    public void setSelectedRows(List<Row> selectedRows) {
        this.selectedRows = selectedRows;
    }

    public void openNew() {
        this.selectedRow = new Row();
    }

    public void saveRow() {
        if (this.selectedRow.getCode() == null) {
            this.selectedRow.setCode(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9));
            this.rows.add(this.selectedRow);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Row Added"));
        }
        else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Row Updated"));
        }

        PrimeFaces.current().executeScript("PF('manageDialog').hide()");
        PrimeFaces.current().ajax().update("form:messages", "form:dt-rows");
    }

    public void deleteRow() {
        this.rows.remove(this.selectedRow);
        this.selectedRows.remove(this.selectedRow);
        this.selectedRow = null;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Row Removed"));
        PrimeFaces.current().ajax().update("form:messages", "form:dt-rows");
    }

    public String getDeleteButtonMessage() {
        if (hasSelectedRows()) {
            int size = this.selectedRows.size();
            return size > 1 ? size + " rows selected" : "1 row selected";
        }

        return "Delete";
    }

    public boolean hasSelectedRows() {
        return this.selectedRows != null && !this.selectedRows.isEmpty();
    }

    public void deleteSelectedRows() {
        this.rows.removeAll(this.selectedRows);
        this.selectedRows = null;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Rows Removed"));
        PrimeFaces.current().ajax().update("form:messages", "form:dt-rows");
        PrimeFaces.current().executeScript("PF('dtRows').clearFilters()");
    }

}