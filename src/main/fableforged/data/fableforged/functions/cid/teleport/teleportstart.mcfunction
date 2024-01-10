execute as @e[tag=teleporttarget] at @s run playsound minecraft:entity.enderman.teleport master @a ~ ~ ~ 1 1
execute as @e[tag=teleporttarget] at @s run tp @e[tag=cid] ^ ^ ^-1 facing entity @e[tag=teleporttarget, limit=1]
execute as @e[tag=cid] at @s run particle flash ~ ~ ~
execute as @e[tag=cid] at @s run particle minecraft:dust 1 0 0.416 1 ~ ~1 ~ 0.5 0.5 0.5 1 20
execute as @e[tag=cid] at @s run particle minecraft:dust 0 0 0 1 ~ ~1 ~ 0.5 0.5 0.5 1 10
tag @e remove flashcuttarget
schedule function fableforged:cid/teleport/teleportcut 5t