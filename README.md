TapTap by Stephanie Cantu
=====================================




How Does it Work?
--------------

For the implementation of my Text Entry Device, I utilized the order and numbering of the alphabet to have users input their desired characters. There were ten buttons that were used in my method, where each button was assigned a number 0-9. In order to type a character or a space, all the user had to do was type the two digits corresponding to that letter. The two digits that corresponded to each letter were assigned based on the number of that letter in the alphabet. For example, if the user wanted to type the letter ‘a’, the user would press buttons 0 and 1, in that order, since ‘a’ is the first letter in the alphabet. If the user wanted to type the letter ‘m’, the user would press buttons 1 and 3. This method was used for all 26 letters of the alphabet. If the user wanted to input a space, they would press button 0 two times. The corresponding number for each letter was put onto a physical key card so that the user would know what numbers to type for each letter. 

Code Implementation
--------------

The code for this device first sets all of the buttons as inputs, and initializes them so that a change in state is recognized. The code then only pays attention to state changes where the button switches from LOW to HIGH, which corresponds to when a button is first pressed and then released. Once this event happens, a counter is also incremented, so that the number of buttons that have been pressed so far can be easily tracked.  Once the button is released, the code recognizes which button was pressed by looking at which GPIO pin was triggered. The code then assigns that button number to an array. The array was initialized at the beginning of the code, and only has two values, at position 0 and at position 1. If the amount of times a button has been pressed is odd, the button number is assigned to the first position in the array. If the amount of times the button has been pressed is even, the button number is assigned to the second position in the array. Once two buttons have been pressed, the values in the array are checked, and depending on what values are in the array, the corresponding letter is printed to the screen. This implementation ensures that a value is only printed to the screen when two buttons have been pressed. This is absolutely necessary as two values are needed for every letter and for a space. 

Physical Device
--------------

Unfortunately, I did not have time to create a physical device for the buttons. I left town for a conference in NYC on Thursday, and so I didn’t have access to any 3D printers or laser cutters. However, if I had been on campus, I would have probably 3D printed a snap fit enclosure for the buttons, so that the user could hold onto the device while typing. I also would have added labels onto the enclosure so that it was clear which button was which.  


I definitely learned a lot from this project, mostly in the coding aspect of the work. I’ve never programmed with Java or on the Android platform, so it was definitely interesting learning about the program and about the hierarchy of Java. It was also useful practicing my soldering skills, as I haven’t soldered straight onto a board before this project. Overall, I thought the project was very useful and informative. My one issue was that I wish I had had more time to work on it before I left for my conference so that I could complete the enclosure aspect of the device. Pictures of my final device and of the wiring and breadboard diagrams are shown below. The video link is also shown below.

https://www.youtube.com/watch?v=o4GXKTwEHlM

./hw2-cstephanie41/Text Entry Device.jpeg

License
-------

Copyright 2016 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
