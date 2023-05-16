package org.it_academy.selenium_study.framework.rest_api.services;

import com.google.common.collect.ImmutableMap;
import org.it_academy.selenium_study.framework.rest_api.models.SushiPageModel;

import java.util.List;
import java.util.Map;

import static org.it_academy.selenium_study.framework.rest_api.endpoints.OnlinerEndpoints.getSushiFilterRollsProductsEndpoint;
import static org.it_academy.selenium_study.framework.rest_api.endpoints.OnlinerEndpoints.getSushiProductsEndpoint;
import static org.it_academy.selenium_study.framework.rest_api.utils.GetRequestUtils.makeGetRequestAndGetBody;

public class ProductService {

    public List<SushiPageModel> getSushiProductsList() {
        return makeGetRequestAndGetBody(getSushiProductsEndpoint(), null, null)
                .jsonPath()
                .getList("products", SushiPageModel.class);
    }

    public List<SushiPageModel> getSushiNamePrefixesList() {
        return makeGetRequestAndGetBody(getSushiFilterRollsProductsEndpoint(), null, null)
                .jsonPath()
                .getList("products", SushiPageModel.class);
    }

    private static Map<String, Object> configureHeaders() {
        return ImmutableMap.of("Host", "catalog.onliner.by");
    }
}
