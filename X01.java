<?xml version="1.0"?>
<flowgorithm fileversion="4.2">
    <attributes>
        <attribute name="name" value="X01PAIR06"/>
        <attribute name="authors" value="Suchia Panjaitan"/>
        <attribute name="about" value=""/>
        <attribute name="saved" value="2024-10-09 04:06:30 PM"/>
        <attribute name="created" value="U3VjaGlhIFBhbmphaXRhbjtMQVBUT1AtN1ZGSUU1MEI7MjAyNC0xMC0wOTswMzoxNzoyNSBQTTszODY0"/>
        <attribute name="edited" value="U3VjaGlhIFBhbmphaXRhbjtMQVBUT1AtN1ZGSUU1MEI7MjAyNC0xMC0wOTswNDowNjozMCBQTTs0OzM5NzA="/>
    </attributes>
    <function name="Main" type="None" variable="">
        <parameters/>
        <body>
            <declare name="Hargabuku, totalharganya, hargapalingkecil, totalnilaitransaksi" type="Real" array="False" size=""/>
            <input variable="Hargabuku"/>
            <assign variable="totalharganya" expression="Hargabuku"/>
            <assign variable="hargapalingkecil" expression="Hargabuku"/>
            <while expression="Hargabuku !=0">
                <if expression="hargapalingkecil&lt;Hargabuku">
                    <then>
                        <assign variable="hargapalingkecil" expression="hargapalingkecil"/>
                    </then>
                    <else>
                        <assign variable="hargapalingkecil" expression="Hargabuku"/>
                    </else>
                </if>
                <input variable="Hargabuku"/>
                <assign variable="totalharganya" expression="totalharganya+Hargabuku"/>
            </while>
            <if expression="totalharganya&gt;=100">
                <then>
                    <assign variable="totalnilaitransaksi" expression="totalharganya-hargapalingkecil"/>
                </then>
                <else>
                    <assign variable="totalnilaitransaksi" expression="totalharganya"/>
                </else>
            </if>
            <output expression="Tofixed(totalnilaitransaksi,2)" newline="True"/>
        </body>
    </function>
</flowgorithm>
