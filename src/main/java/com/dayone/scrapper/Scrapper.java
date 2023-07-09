package com.dayone.scrapper;

import com.dayone.model.Company;
import com.dayone.model.ScrapedResult;


public interface Scrapper {
    Company scrapCompanyByTicker(String ticker);
    ScrapedResult scrap(Company company);
}
