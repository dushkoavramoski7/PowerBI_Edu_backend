package com.example.powerbi_edu_backend.Model.config;

import com.example.powerbi_edu_backend.Model.Entities.Documentations;
import com.example.powerbi_edu_backend.Model.Entities.News;
import com.example.powerbi_edu_backend.Repository.DocumentationsRepository;
import com.example.powerbi_edu_backend.Repository.NewsRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Component
public class InitialDataInsert {
    private final NewsRepository newsRepository;
    private final DocumentationsRepository documentationsRepository;

    public InitialDataInsert(NewsRepository newsRepository, DocumentationsRepository documentationsRepository) {
        this.newsRepository = newsRepository;
        this.documentationsRepository = documentationsRepository;
    }

    @PostConstruct
    public void initData()
    {
        this.newsRepository.save(new News("Power BI July 2022 Feature Summary", "PowerBI Mobile", LocalDateTime.of(2022, 7, 14, 5,5,5), "Welcome to the July 2022 update. We are thrilled to announce the Error Bars general availability, Metric visuals and Datamarts updates, query performance and data hub improvements, Data in space augmented reality new mobile feature, accessibility enhancements for embedded reports. There is more to explore, please continue to read on.", List.of("Announcements", "Features"),"https://powerbi.microsoft.com/en-us/blog/power-bi-july-2022-feature-summary/"));
        this.newsRepository.save(new News("“Data in space” in preview: Now Power BI can be truly everywhere", "PowerBI Mobile", LocalDateTime.of(2022, 7, 6, 5,5,5), "We live in a connected world and almost everything around us generates data. Data in Space is new feature that uses augmented reality to create persistent spatial anchors in the real world and attach Power BI content to those anchors. Data in space connects your business data to your real-world scenarios in facility management, manufacturing, retail and many more, and now employees can easily discover and use it for better, and more informed decisions.",List.of("Announcements", "Data loss prevention"), "https://powerbi.microsoft.com/en-us/blog/data-in-space-in-preview-now-power-bi-can-be-truly-everywhere/"));
        this.newsRepository.save(new News("Analyzing your Microsoft Exchange Account Data with Power Query", "PowerBI Desktop", LocalDateTime.of(2021, 1, 9, 5,5,5), "One of the interesting additions to the Power Query Preview December update is the ability to import data from Microsoft Exchange. In this blog post, Miguel Llopis (a Program Manager in the Power Query team) will walk us through the capabilities exposed by this new feature and show how you can easily do analytics on top of your Exchange account.", List.of("Analysis Services"), "https://powerbi.microsoft.com/en-us/blog/analyzing-your-microsoft-exchange-account-data-with-power-query/"));
        this.newsRepository.save(new News("Happy Holidays with Power BI Mobile, Part 2: Tracking Santa with Power Map", "PowerBI Mobile", LocalDateTime.of(2021, 12, 25, 5,5,5), "Following up on our Holiday post last week, we wanted to track Santa using Power Map!In this video you can find Santa’s official NORAD route around the world with more insights about some destinations and visitors to the official NORAD Santa Tracker.", List.of("Announcements", "Developers"), "https://powerbi.microsoft.com/en-us/blog/happy-holidays-with-power-bi-part-2-tracking-santa-with-power-map/"));
        this.newsRepository.save(new News("Updates to Microsoft Purview data loss prevention policies in Power BI Desktop", "PowerBI Desktop", LocalDateTime.of(2022, 8, 22, 5,5,5), "Data loss prevention (DLP) policies help you govern the sensitive information managed in your Power BI tenant and comply with governmental or industry regulations, such as GDPR (the European Union’s General Data Protection Regulation). Earlier this year, we announced the release of DLP policies for Power BI to public preview. We’re happy to share with you two significant enhancements to DLP policies in Power BI: CPU metering for DLP policy evaluation, ability to override DLP policy tips and option to report of a false positive detection.", List.of("Developers", "Features", "Analysis Services"),"https://powerbi.microsoft.com/en-us/blog/updates-to-microsoft-purview-data-loss-prevention-policies-in-power-bi/"));
        this.newsRepository.save(new News("Join us! 18-23 September 2022. The FIRST ever Microsoft Power Platform Conference!", "PowerBI Desktop", LocalDateTime.of(2022, 8, 8, 5,5,5), "The first annual Power Platform Conference sponsored by Microsoft and Power Platform Conference is coming to Orlando for an amazing in-person event this September, with keynotes, sessions, breakouts and more! All dedicated to Microsoft Power Platform products: Power BI, Power Automate, Power Apps, Power Pages, and Power Virtual Agents.", List.of("Developers", "Information Protection"), "https://powerbi.microsoft.com/en-us/blog/join-us-september-18-23-for-the-first-ever-microsoft-power-platform-conference/"));
        this.newsRepository.save(new News("Analysis Services server properties in Power BI Premium are now in public preview", "PowerBI Service", LocalDateTime.of(2022, 8, 2, 5,5,5), "At Power BI, we’ve committed to providing powerful enterprise modeling capabilities to Power BI Premium. As part of our product journey over the past five years, this commitment has brought numerous Azure Analysis Services (AAS) semantic modeling features for performance and management to Power BI Premium.", List.of("Announcements", "Report Server"), "https://powerbi.microsoft.com/en-us/blog/analysis-services-server-properties-in-power-bi-premium-are-now-in-public-preview/"));
        this.newsRepository.save(new News("ExecuteQueries REST API versus XMLA endpoints at scale", "PowerBI Service", LocalDateTime.of(2022, 7, 18, 5,5,5), "Power BI APIs can support you at any scale, but there is no one-size-fits-all API. The ExecuteQueries API is a great choice at small scale. For large-scale solutions, switch to XMLA endpoints and host your datasets on Power BI Premium.", List.of("Announcements", "API", "Features"), "https://powerbi.microsoft.com/en-us/blog/executequeries-rest-api-versus-xmla-endpoints-at-scale/"));
        this.newsRepository.save(new News("Power BI paves the way for smooth Azure Analysis Services migrations", "PowerBI Service", LocalDateTime.of(2022, 8, 16, 5,5,5), "We are committed to helping our Azure Analysis Services customers unlock the enormous capabilities of Power BI as a superset of Azure Analysis Services through a smooth migration path to Power BI. As part of this effort, we are happy to announce today that Power BI has reached yet another compatibility milestone with the introduction of explicit Dataset Write permissions.", List.of("Announcements", "Goals"), "https://powerbi.microsoft.com/en-us/blog/power-bi-paves-the-way-for-smooth-azure-analysis-services-migrations/"));

        this.documentationsRepository.save(new Documentations("Embedded analytics", "PowerBI Desktop", List.of("What is Power BI embedded analytics?---https://docs.microsoft.com/en-us/power-bi/developer/embedded/em", "Power BI Embedded Generation 2---https://docs.microsoft.com/en-us/power-bi/developer/embedded/power-bi","Power BI Developer in a Day course---https://docs.microsoft.com/en-us/javascript/api/overview/powerbi/")));


    }
}
