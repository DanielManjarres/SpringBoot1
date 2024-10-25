package com.example.archivosapi.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class ArchivoController {

    // Endpoint para cargar una imagen JPG
    @GetMapping("/apiarchivos/imagen/{nombre}")
    public ResponseEntity<Resource> cargarImagen(@PathVariable String nombre) throws IOException {
        Resource resource = new ClassPathResource("static/imagenes/" + nombre + ".jpg");
        if (resource.exists()) {
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, "image/jpeg")
                    .body(resource);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint para cargar un archivo HTML
    @GetMapping("/apiarchivos/html/{nombre}")
    public ResponseEntity<Resource> cargarHtml(@PathVariable String nombre) throws IOException {
        Resource resource = new ClassPathResource("static/html/" + nombre + ".html");
        if (resource.exists()) {
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, "text/html")
                    .body(resource);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint para cargar un archivo XML
    @GetMapping("/apiarchivos/xml/{nombre}")
    public ResponseEntity<Resource> cargarXml(@PathVariable String nombre) throws IOException {
        Resource resource = new ClassPathResource("static/xml/" + nombre + ".xml");
        if (resource.exists()) {
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, "application/xml")
                    .body(resource);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint para cargar un archivo JSON
    @GetMapping("/apiarchivos/json/{nombre}")
    public ResponseEntity<Resource> cargarJson(@PathVariable String nombre) throws IOException {
        Resource resource = new ClassPathResource("static/json/" + nombre + ".json");
        if (resource.exists()) {
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, "application/json")
                    .body(resource);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint para cargar un archivo PDF
    @GetMapping("/apiarchivos/pdf/{nombre}")
    public ResponseEntity<Resource> cargarPdf(@PathVariable String nombre) throws IOException {
        Resource resource = new ClassPathResource("static/pdf/" + nombre + ".pdf");
        if (resource.exists()) {
            return ResponseEntity.ok()
                    .header(HttpHeaders.CONTENT_TYPE, "application/pdf")
                    .body(resource);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
