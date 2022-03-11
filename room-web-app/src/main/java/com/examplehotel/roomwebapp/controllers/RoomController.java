package com.examplehotel.roomwebapp.controllers;

import java.util.ArrayList;
import java.util.List;

import com.examplehotel.roomwebapp.models.Room;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    
    private static final List<Room> rooms = new ArrayList<>();
    /*
        Static Blocks
        Static code blocks are used to initialise static variables. 
        These blocks are executed immediately after declaration of static variables.
        https://www.freecodecamp.org/news/java-static-keyword-explained/
    */
    static {
        for(int i = 0;i < 10; i++) {
            rooms.add(new Room(i, "Room" + i, "R" + i, "Q"));
        }
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", rooms);
        return "rooms";
    }
}
