package ldsbc.springboot.service;

import org.springframework.stereotype.*;

/**
 * Created by CSmith on 3/8/2017.
 */
@org.springframework.stereotype.Service
public class DefaultService implements Service {
  
  @Override
  public String getText() {
    return "hi there";
  }
}
