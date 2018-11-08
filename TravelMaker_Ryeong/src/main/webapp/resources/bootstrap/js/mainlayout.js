function tag(tagname) {
        if(tagname == 1) {
          document.getElementById("navmenu").innerHTML = "Master";
          document.getElementById("leftmenu1").innerHTML = "Master menu1";
          document.getElementById("leftmenu2").innerHTML = "Master menu2";
          document.getElementById("leftmenu3").innerHTML = "Master menu3";
        }

        else if(tagname == 2) {
          document.getElementById("navmenu").innerHTML = "Allowance";
          document.getElementById("leftmenu1").innerHTML = "Allowance menu1";
          document.getElementById("leftmenu2").innerHTML = "Allowance menu2";
          document.getElementById("leftmenu3").innerHTML = "Allowance menu3";
        }        
        else if(tagname == 3) {
          document.getElementById("navmenu").innerHTML = "Bonus";
          document.getElementById("leftmenu1").innerHTML = "Bonus menu1";
          document.getElementById("leftmenu2").innerHTML = "Bonus menu2";
          document.getElementById("leftmenu3").innerHTML = "Bonus menu3";
        }
        else if(tagname == 4){ 
          document.getElementById("navmenu").innerHTML = "BPS";
          document.getElementById("leftmenu1").innerHTML = "BPS menu1";
          document.getElementById("leftmenu2").innerHTML = "BPS menu2";
          document.getElementById("leftmenu3").innerHTML = "BPS menu3";
        }
        else if(tagname == 5) {
          document.getElementById("navmenu").innerHTML = "SF WS";        
          document.getElementById("leftmenu1").innerHTML = "SF WS menu1";
          document.getElementById("leftmenu2").innerHTML = "SF WS menu2";
          document.getElementById("leftmenu3").innerHTML = "SF WS menu3";
        }
        else if(tagname == 6) {
          document.getElementById("navmenu").innerHTML = "통계/분석";
          document.getElementById("leftmenu1").innerHTML = "통계/분석 menu1";
          document.getElementById("leftmenu2").innerHTML = "통계/분석 menu2";
          document.getElementById("leftmenu3").innerHTML = "통계/분석 menu3";
        }
      }