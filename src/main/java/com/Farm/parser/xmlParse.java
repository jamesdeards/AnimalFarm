package com.Farm.parser;

import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xmlParse {
    File myXML;
    NodeList nodeList;
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    //construct parser from path to xml
    public xmlParse(String xmlFileName) throws Exception {
        myXML = new File(xmlFileName);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(myXML);
        nodeList = document.getDocumentElement().getChildNodes();
    }
    //make query from attribute & content, returns hashmap of results
    private HashMap query(String attributeToGet, String contentToGet) throws Exception  {
        HashMap<String, String> results = new HashMap<String, String>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            //Take selected node
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element elem = (Element) node;

                // Get the value of the ID attribute.
                String attribute = node.getAttributes().getNamedItem(attributeToGet).getNodeValue();

                // Get the value of all sub-elements.
                String content = elem.getElementsByTagName(contentToGet)
                        .item(0).getChildNodes().item(0).getNodeValue();

                // Add results to hashmap if both non-null
                if(!content.isEmpty() && !attribute.isEmpty()){
                    results.put(attribute,content);
                }
            }
        }
        return results;
    }
}
