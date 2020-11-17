package com.pluralsight.conferencedemo.models.projections;

import com.pluralsight.conferencedemo.models.Session;
import com.pluralsight.conferencedemo.models.Speaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name="sessionDetailView", types = {Session.class})
public interface SessionDetailView {
    @Value("#{target.sessionName}")
    String getTitle();
    String getSessionDescription();
    Integer getSessionLength();
    List<Speaker> getSpeakers();
    @Value("#{target.speakers.size()}")
    Integer getSpeakerCount();
}
