package com.alayon.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "posts")
@Data
@NoArgsConstructor
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPost;

	@Column(length = 50, nullable = true)
	private String titulo;

	@Column(length = 255, nullable = false)
	private String mensaje;

	@Column
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;

	@Column
	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;

	@Override
	public String toString() {
		return "Post [idPost=" + idPost + ", titulo=" + titulo + ", mensaje=" + mensaje + ", fechaAlta=" + fechaAlta
				+ ", fechaModificacion=" + fechaModificacion + "]";
	}
}
