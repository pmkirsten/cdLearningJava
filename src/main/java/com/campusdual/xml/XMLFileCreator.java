package com.campusdual.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLFileCreator {

    private static void createDocument() throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        Element root = document.createElement("computer");
        document.appendChild(root);
        Element components = document.createElement("components");
        root.appendChild(components);
        components.appendChild(createItem(document, "component", "Graphic card", 2));
        components.appendChild(createItem(document, "component", "CPU", 1));
        components.appendChild(createItem(document, "component", "Fan", 3));
        components.appendChild(createItem(document, "component", "Motherboard", 1));
        components.appendChild(createItem(document, "component", "RAM", 2));
        components.appendChild(createItem(document, "component", "SSD", 2));
        components.appendChild(createItem(document, "component", "Power supply", 1));
        components.appendChild(createItem(document, "component", "Computer case", 1));
        writeToFile(document, "src/main/resources/computerList.xml");
    }

    private static void writeToFile(Document document, String path) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
        File file = new File(path);
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(file);
        transformer.transform(source, result);
    }

    private static Element createItem(Document document, String tag, String item, int quantity) {
        Element element = document.createElement(tag);
        element.setAttribute("quantity", String.valueOf(quantity));
        element.setTextContent(item);
        return element;
    }


    static void main() {
        try {
            createDocument();
        } catch (ParserConfigurationException | TransformerException e) {
            throw new RuntimeException(e);
        }
    }


}
