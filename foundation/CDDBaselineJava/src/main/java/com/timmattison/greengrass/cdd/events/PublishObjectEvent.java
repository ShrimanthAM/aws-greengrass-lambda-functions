package com.timmattison.greengrass.cdd.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PublishObjectEvent {
    private String topic;
    private Object object;
}