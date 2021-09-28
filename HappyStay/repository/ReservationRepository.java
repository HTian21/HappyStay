package com.laioffer.happystay.repository;

import com.laioffer.happystay.model.Reservation;
import com.laioffer.happystay.model.Stay;
import com.laioffer.happystay.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByGuest(User guest);

    List<Reservation> findByStay(Stay stay);

    List<Reservation> findByStayAndCheckoutDateAfter(Stay stay, LocalDate date);
}
