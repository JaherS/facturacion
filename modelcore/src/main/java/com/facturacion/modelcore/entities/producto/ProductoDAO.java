package com.facturacion.modelcore.entities.producto;

import com.facturacion.modelcore.entities.categoriaProducto.CategoriaDAO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Producto")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductoDAO implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PRODUCTO_ID")
    private Long productoId;

    @Column(name = "PRODUCTO_NOMBRE", nullable = false, length = 100, unique = true)
    private String productoNombre;

    @Column(name = "PRODUCTO_DESCRIPCION", nullable = false, length = 250)
    private String productoDesc;

    @Column(name = "PRODUCTO_UNIDADES", nullable = false)
    private Long productoUnidades;

    @JoinColumn(name = "CATEGORIA_ID", referencedColumnName = "CATEGORIA_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoriaDAO categoriaPago;

}
