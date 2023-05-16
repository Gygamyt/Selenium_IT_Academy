package org.it_academy.selenium_study.framework.rest_api.endpoints;

import org.it_academy.selenium_study.framework.utils.PropReader;

public class OnlinerEndpoints {

    public static String getSushiProductsEndpoint() {
        return PropReader.getEndpointProperty("sushi_products");
    }

    public static String getSushiFilterRollsProductsEndpoint() {
        return PropReader.getEndpointProperty("sushi_filter_rolls_products");
    }
}
