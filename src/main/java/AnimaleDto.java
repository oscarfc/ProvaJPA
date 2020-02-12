
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tss
 */
@Entity
@Table(name = "schema_jpa.T_animali")
public class AnimaleDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_animali;
    @Column(name = "descrizione")
    private String descrizione;
    @Column(name = "specie")
    private String specie;
    @Column(name = "classe")
    private String classe;
    @Column(name = "ordine")
    private String ordine;

    @Transient
    private String a; // questo valore non viene trasferito nel DB perche specificato Transient

    public AnimaleDto() {
    }

    public AnimaleDto(String descrizione, String specie, String classe, String ordine) {
        this.descrizione = descrizione;
        this.specie = specie;
        this.classe = classe;
        this.ordine = ordine;
    }

    public Long getId_animali() {
        return id_animali;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getSpecie() {
        return specie;
    }

    public String getClasse() {
        return classe;
    }

    public String getOrdine() {
        return ordine;
    }

    public void setId_animali(Long id_animali) {
        this.id_animali = id_animali;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setOrdine(String ordine) {
        this.ordine = ordine;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id_animali);
        hash = 97 * hash + Objects.hashCode(this.descrizione);
        hash = 97 * hash + Objects.hashCode(this.specie);
        hash = 97 * hash + Objects.hashCode(this.classe);
        hash = 97 * hash + Objects.hashCode(this.ordine);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnimaleDto other = (AnimaleDto) obj;
        if (!Objects.equals(this.id_animali, other.id_animali)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AnimaleDto{" + "id_animali=" + id_animali + ", descrizione=" + descrizione + ", specie=" + specie + ", classe=" + classe + ", ordine=" + ordine + '}';
    }
}
