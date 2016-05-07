
package org.datacontract.schemas._2004._07.myconsoleapplication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genres_books complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genres_books">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="books" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}books" minOccurs="0"/>
 *         &lt;element name="genres" type="{http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model}genres" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id_book" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id_genre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genres_books", propOrder = {
    "books",
    "genres",
    "id",
    "idBook",
    "idGenre"
})
public class GenresBooks {

    @XmlElementRef(name = "books", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Books> books;
    @XmlElementRef(name = "genres", namespace = "http://schemas.datacontract.org/2004/07/MyConsoleApplication.Model", type = JAXBElement.class, required = false)
    protected JAXBElement<Genres> genres;
    protected Integer id;
    @XmlElement(name = "id_book")
    protected Integer idBook;
    @XmlElement(name = "id_genre")
    protected Integer idGenre;

    /**
     * Gets the value of the books property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Books }{@code >}
     *     
     */
    public JAXBElement<Books> getBooks() {
        return books;
    }

    /**
     * Sets the value of the books property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Books }{@code >}
     *     
     */
    public void setBooks(JAXBElement<Books> value) {
        this.books = value;
    }

    /**
     * Gets the value of the genres property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Genres }{@code >}
     *     
     */
    public JAXBElement<Genres> getGenres() {
        return genres;
    }

    /**
     * Sets the value of the genres property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Genres }{@code >}
     *     
     */
    public void setGenres(JAXBElement<Genres> value) {
        this.genres = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the idBook property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdBook() {
        return idBook;
    }

    /**
     * Sets the value of the idBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdBook(Integer value) {
        this.idBook = value;
    }

    /**
     * Gets the value of the idGenre property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdGenre() {
        return idGenre;
    }

    /**
     * Sets the value of the idGenre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdGenre(Integer value) {
        this.idGenre = value;
    }

}
