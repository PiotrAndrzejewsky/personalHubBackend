package com.Itransition.personalHub.CollectionProperties;

import java.time.LocalDateTime;

public interface CollectionPropertiesService {
    void update(CollectionPropertiesEntity collectionProperties, Long collectionId);
    CollectionPropertiesEntity getCollectionPropertiesByCollectionId(Long collectionId);
    void createCollectionProperties(CollectionPropertiesEntity collectionPropertiesEntity, Long collectionId);
}
