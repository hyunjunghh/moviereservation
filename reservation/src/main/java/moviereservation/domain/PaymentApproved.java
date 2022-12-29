package moviereservation.domain;

import moviereservation.domain.*;
import moviereservation.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private Long id;
    private String paymentId;
    private String movieId;
    private String approveDate;
    private Integer amount;
    private String status;
    private String qty;
}


